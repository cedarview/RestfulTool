rootProject.name = "RestfulTool"

pluginManagement {
    repositories {
        maven {
            setUrl("https://maven.aliyun.com/repository/google")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/public")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/gradle-plugin")
        }

        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
