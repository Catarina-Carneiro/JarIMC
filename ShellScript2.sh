#!/bin/bash
which java | grep -q /bin/java
if [ $? = 0 ]

then echo "Realizando execução do Java"
        if[[-d "$/home/a02201009/Desktop/JarIMC"]]
then 
        cd /home/a02201009/Desktop
        git clone https://github.com/Catarina-Carneiro/JarIMC.git
        java -jar Continua3-1.0-SNAPSHOT-jar-with-dependencies.jar 
fi
        cd /home/a02201009/Desktop
        java -jar Continua3-1.0-SNAPSHOT-jar-with-dependencies.jar 
else echo "Realiazndo instalação do Java"
        sudo apt install curl
        sudo apt install curl
        curl -s “https://get.sdkman.io” | bash
        source “$HOME/.sdkman/bin/sdkman-init.sh”
        sdk install java 8.0.265.j9-adpt
        echo "Realizando execução do Java"
        cd /home/a02201009/Desktop
        git clone https://github.com/Catarina-Carneiro/JarIMC.git
        java -jar Continua3-1.0-SNAPSHOT-jar-with-dependencies.jar 
fi