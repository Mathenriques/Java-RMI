# Use a imagem oficial do Ubuntu como base
FROM ubuntu:latest

# Atualize o sistema e instale o JDK
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk && \
    apt-get clean

# Defina a variável de ambiente JAVA_HOME
ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk-amd64

# Adicione o diretório bin do JDK ao PATH
ENV PATH $PATH:$JAVA_HOME/bin

# Copia os arquivos dessa pasta para dentro do container
COPY ./Servidor /app/RMI/Servidor
COPY ./Cliente /app/RMI/Cliente

# Defina um diretório de trabalho padrão
WORKDIR /app

# Comando padrão a ser executado ao iniciar o container (opcional)
CMD ["bash"]
