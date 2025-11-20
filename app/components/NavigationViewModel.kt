    var currentScreen by mutableStateOf(Screen.HOME)
        private set
    var points = mutableStateOf(0)
    var next = mutableStateOf(0)
    var totalQuestions = QuestionList().quiz.size

    fun navigateTo(screen: Screen) {
        currentScreen = screen
    }

    fun updatePoints(){
        points.value++
    }

    fun returnPoints(): Int {
        return points.value
    }

    fun nextQuestion(){
        next.value++
    }
    fun nextQuestionIndex(): Int {
        return next.value
    }
