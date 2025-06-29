# 使用本地镜像
FROM openjdk:8-jre-slim
# 作者
LABEL authors="xing"
# 设置工作目录为 (自定义)
WORKDIR /usr/local/jar
# 将当前目录下的renren.jar复制到容器的任意目录中
COPY target/web.jar /usr/local/jar/web.jar
# 暴露应用的端口 默认8080
EXPOSE 9090
RUN which java || echo "Java not found in PATH"
RUN echo $PATH
# 容器启动时执行的命令
CMD ["java", "-jar", "/usr/local/jar/web.jar"]

