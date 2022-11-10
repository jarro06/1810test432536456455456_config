 
listView('1810test432536456455456 Jobs') {
    description('1810test432536456455456 Jobs')
    jobs {
        regex('1810test432536456455456_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
