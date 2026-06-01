theme: /

    state: Start
        q!: привет
        go!: /hello
        q!: здравствуй
        go!: /hello
        q!: здравствуйте
        go!: /hello
        q!: добрый день
        go!: /hello
        q!: hello
        go!: /hello
        q!: hi
        go!: /hello
        q!: помощь
        go!: /hello
        q!: бот
        go!: /hello

        q!: погода
        go!: /weather
        q!: погоду
        go!: /weather
        q!: какая погода
        go!: /weather
        q!: какая сегодня погода
        go!: /weather
        q!: расскажи погоду
        go!: /weather
        q!: расскажи о погоде
        go!: /weather
        q!: прогноз
        go!: /weather
        q!: прогноз погоды
        go!: /weather
        q!: температура
        go!: /weather
        q!: weather
        go!: /weather
        q!: forecast
        go!: /weather

        q!: курс
        go!: /currency
        q!: курс валют
        go!: /currency
        q!: валюта
        go!: /currency
        q!: валюты
        go!: /currency
        q!: курс доллара
        go!: /currency
        q!: доллар
        go!: /currency
        q!: курс евро
        go!: /currency
        q!: евро
        go!: /currency
        q!: currency
        go!: /currency
        q!: exchange
        go!: /currency

    state: hello
        a: Привет! Я бот-помощник. Могу рассказать о погоде и курсах валют.
        go!: /Start

    state: weather
        a: Сегодня ожидается переменная облачность, без сильных осадков. Температура около +20 градусов.
        go!: /Start

    state: currency
        a: Курс валют: доллар — около 90 рублей, евро — около 100 рублей.
        go!: /Start

    state: NoMatch
        event!: noMatch
        a: Я не понял запрос. Я могу помочь с погодой или курсом валют.
        go!: /Start