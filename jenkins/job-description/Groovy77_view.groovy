 
listView('Groovy77 Jobs') {
    description('Groovy77 Jobs')
    jobs {
        regex('Groovy77_.+')
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
