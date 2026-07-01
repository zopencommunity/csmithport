node('linux') {
  stage ('Poll') {
    checkout([
      $class: 'GitSCM', branches: [[name: '*/main']], extensions: [],
      userRemoteConfigs: [[url: 'https://github.com/zopencommunity/csmithport.git']]])
  }
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [
      string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/zopencommunity/csmithport.git'),
      string(name: 'PORT_DESCRIPTION', value: 'Csmith is a random generator of C programs. It"s primary purpose is to find compiler bugs with random programs, using differential testing as the test oracle. Csmith can be used outside of the field of compiler testing. If your application needs a test suite of C programs and you don"t bother to write them, feel free to give Csmith a try. Csmith outputs C programs free of undefined behaviors (believe us, that"s not trivial), and the statistics of each generated program.'),
      string(name: 'BUILD_LINE', value: 'DEV')
    ]
  }
}
