pipeline {
    agent any

    tools {
        // Herramientas preinstaladas en Jenkins (asegúrate de configurar JDK y Gradle en Jenkins primero)
        jdk 'JDK 17'          // Nombre configurado en "Global Tool Configuration"
        gradle 'Gradle 8.14.3'   // Nombre configurado en Jenkins también
    }

    environment {
        // Variables de entorno necesarias para Gradle + Java
        JAVA_HOME = "${tool 'JDK 17'}"
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                echo '🔄 Descargando código...'
                checkout scm
            }
        }

        stage('Compilar') {
            steps {
                echo '🛠️ Compilando el proyecto...'
                bat './gradlew clean compileJava'
            }
        }

        stage('Test') {
            steps {
                echo '🧪 Ejecutando pruebas...'
                bat './gradlew test'
            }
        }

        stage('Build') {
            steps {
                echo '📦 Generando JAR...'
                bat './gradlew build'
            }
        }

        stage('Empaquetar Artefacto (opcional)') {
            when {
                expression { fileExists('build/libs') }
            }
            steps {
                echo '📁 Artefactos generados:'
                bat 'ls -lh build/libs'
            }
        }

        // Puedes añadir etapas para SonarQube, Docker, AWS.
    }

    post {
        success {
            echo '✅ Pipeline finalizado correctamente.'
        }
        failure {
            echo '❌ Algo falló en el pipeline.'
        }
    }
}
