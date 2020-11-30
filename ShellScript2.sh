#!/bin/bash
which java | grep -q /bin/java
if [ $? = 0 ]


then echo "Realizando execução do Java"
        java -jar Continua3-1.0-SNAPSHOT-jar-with-dependencies.jar 
else echo "Realiazndo instalação do Java"
        sudo apt install curl
        sudo apt install curl
        curl -s “https://get.sdkman.io” | bash
        source “$HOME/.sdkman/bin/sdkman-init.sh”
        sdk install java 8.0.265.j9-adpt
        echo "Realizando execução do Java"
        cd /home/ubuntu/Desktop/JAVA/JarIMC/Continua3/target
        java -jar Continua3-1.0-SNAPSHOT-jar-with-dependencies.jar 
fi