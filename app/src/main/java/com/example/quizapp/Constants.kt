package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val q1 = Question(1, "What is the name of this historical structure " +
                "which is located in Piazza del Duomo, Italy:",
                R.drawable.first,
                "Colosseum",
                "Leaning Tower of Pisa",
                "Milan Cathedral",
                "Ponte Vecchio", 2
        )
        questionList.add(q1)

        val q2 = Question(2, "The structure below located in the Middle East was built thousands of years ago, and still stands today. " +
                "which is located in Piazza del Duomo, Italy:",
                R.drawable.three,
                "Pharaoh’s Tomb",
                "Joseph’s Tomb",
                "Egyptian Pyramid",
                "Mecca Temple", 3
        )
        questionList.add(q2)

        val q3 = Question(3, "The highest mountain in the world, standing at 8,848 meters and 29,029 feet, with 145 attempts to climb it.",
                R.drawable.four,
                "Makalu",
                "Nanga Parbat",
                "Himalayan Mountains",
                "Mount Everest", 4
        )
        questionList.add(q3)

        val q4 = Question(4, "This is longest wall in the world and has a main-line length of 3,460 km (2,150 miles – nearly three times the length of Britain – plus 3,530 km (2,193 miles) of branches and spurs.",
                R.drawable.five,
                "Kumbhalgarh Fort",
                "Great Wall of China",
                "Amer Fort Jaipur",
                "Ancient Walls of Mesopotamia", 2
        )
        questionList.add(q4)

        val q5 = Question(5, "This famed area is located in the mountains, at more than 2,400 metres/8,000 feet above sea level. This ruin site has more than 200 different buildings and structures.",
                R.drawable.six,
                "Machu Picchu",
                "Nazca Lines",
                "Choquequirao",
                "Chichen Itza", 1
        )
        questionList.add(q5)
        return questionList
    }

}