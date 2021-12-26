// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        //TODO Step 2 :Using function calls instead of property assignment used by Groovy
        // if you are using specific maven url like this [maven { url 'https://jitpack.io' }]
        // it will be written this way [maven("https://jitpack.io")]
    }
    dependencies {
        //TODO Step 2 :Using function calls instead of property assignment used by Groovy [classpath("your classpath")]
        classpath "com.android.tools.build:gradle:7.0.4"
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10"
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5"
    }
}

//TODO Step 3 register your tasks
// you will use [tasks.register("clean",  Delete::class)]
// where register is an extension function for TaskContainer class
// with String parameter for task name and ConventionTask class which is Delete in this task
// and function call for delete [delete(rootProject.buildDir)]
task clean(type: Delete) {
    delete rootProject.buildDir
}