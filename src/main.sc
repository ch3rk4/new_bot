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

        q!: погода
        go!: /weather
        q!: погоду
        go!: /weather
        q!: какая погода
        go!: /weather
        q!: прогноз погоды
        go!: /weather
        q!: расскажи о погоде
        go!: /weather
        q!: температура
        go!: /weather
        q!: weather
        go!: /weather

        q!: курс валют
        go!: /currency
        q!: курс валюты
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

    state: hello
        a: Привет! Я бот-помощник. Могу рассказать о погоде и курсах валют.

    state: weather
        a: Сегодня ожидается переменная облачность, без сильных осадков. Температура около +20 градусов.

    state: currency
        a: Курс валют: доллар — около 90 рублей, евро — около 100 рублей.

    state: NoMatch
        event!: noMatch
        a: Я не понял запрос. Я могу помочь с погодой или курсом валют.