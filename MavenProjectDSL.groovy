job('DeenaTHirdMavenProjectViaDSL') {
    description("Third Maven job generated by the DSL on ${new Date()}, the project is a small Maven project hosted on github")
    scm {
        git("https://github.com/deena-p/Jenkins_Upgradev3.git", 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'java-tomcat-sample/pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.war'
    }
}