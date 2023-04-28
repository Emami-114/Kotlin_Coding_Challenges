




fun main() {
    println("Bitte geben Sie das Jahr ein (z.B. 2022):")
    val year = readln()
    println("Bitte geben Sie den Monat ein (z.B. 01):")
    val month = readln()
    println("Bitte geben Sie den Tag ein (z.B. 01):")
    val day = readln()

    val mails = getMailsByDate("$year-$month-$day")
    printResult(mails)
}

/**
 * Bekommt ein Datum in folgendem Format übergeben: YYYY-MM-TT
 * Gibt eine Liste zurück, in der nur die EMails des angegebenen Tages enthalten sind und
 * in der die EMails nach Uhrzeit sortiert sind
 */
private fun getMailsByDate(date: String): List<EMail> {
    return  getMails().filter {it.date.contains("$date")}.sortedBy { it.date.split(" ")[1] }
}

/**
 * Druckt das Ergebnis der getMailsByDate Funktion
 */
private fun printResult(result: List<EMail>) {
    repeat(3){
        print(".")
        Thread.sleep(300)
    }
    println("\n")
    for (mail in result){
        println("${mail.subject}, empfangen: ${mail.date}Uhr")
        Thread.sleep(200)
        println("Von: ${mail.sender}, an: ${mail.recipient}")
        Thread.sleep(200)
        println("Nachricht: ${mail.message}")
        Thread.sleep(200)
        println()
        Thread.sleep(200)
    }
    println("${result.size} Emails für dieses Datum gefunden")
}
















data class EMail(
    val sender: String,
    val recipient: String,
    val subject: String,
    val date: String,
    val message: String
)




fun getMails(): List<EMail> {
    return listOf(
        EMail(
            sender = "john.doe@example.com",
            recipient = "jane.doe@example.com",
            subject = "Meeting tomorrow",
            date = "2022-01-01 10:00:00",
            message = "Hi Jane, we have a meeting tomorrow at 11 am. Don't forget to bring the report."
        ),
        EMail(
            sender = "jane.doe@example.com",
            recipient = "john.doe@example.com",
            subject = "RE: Meeting tomorrow",
            date = "2022-01-01 11:30:00",
            message = "Hi John, thanks for reminding me. I'll bring the report to the meeting."
        ),
        EMail(
            sender = "mary.smith@example.com",
            recipient = "john.doe@example.com",
            subject = "Regarding the upcoming project",
            date = "2022-04-30 16:00:00",
            message = "Hi John, I wanted to follow up on our meeting last week regarding the upcoming project. Can we schedule another meeting to discuss the budget?"
        ),
        EMail(
            sender = "john.doe@example.com",
            recipient = "mary.smith@example.com",
            subject = "RE: Regarding the upcoming project",
            date = "2022-04-30 17:00:00",
            message = "Hi Mary, thanks for following up. Let's schedule a meeting for next Wednesday at 10 am to discuss the budget."
        ),
        EMail(
            sender = "jim.smith@example.com",
            recipient = "john.doe@example.com",
            subject = "Job Offer",
            date = "2022-04-30 11:00:00",
            message = "Hi John, I wanted to offer you the job. The salary is negotiable, so let me know if you have any questions or concerns."
        ),
        EMail(
            sender = "john.doe@example.com",
            recipient = "jim.smith@example.com",
            subject = "RE: Job Offer",
            date = "2022-04-29 12:00:00",
            message = "Hi Jim, thanks for the offer. The salary seems fair, but I would like to discuss the benefits package before making a decision. Can we schedule a call to discuss further?"
        ),
        EMail(
            sender = "amy.jones@example.com",
            recipient = "peter.wilson@example.com",
            subject = "New project idea",
            date = "2022-04-28 09:00:00",
            message = "Hi Peter, I have a new project idea that I think would be perfect for our company. Let's schedule a call to discuss further."
        ),
        EMail(
            sender = "peter.wilson@example.com",
            recipient = "amy.jones@example.com",
            subject = "RE: New project idea",
            date = "2022-04-28 10:00:00",
            message = "Hi Amy, sure, I can talk now. Let's set up a call to discuss the idea in more detail."
        ),
        EMail(
            sender = "info@company.com",
            recipient = "customer1@example.com",
            subject = "New Product Launch",
            date = "2022-04-27 09:00:00",
            message = "Dear Customer, we are excited to announce the launch of our new product line. Visit our website to learn more and place your order today!"
        ),
        EMail(
            sender = "info@company.com",
            recipient = "customer2@example.com",
            subject = "New Product Line",
            date = "2022-04-27 09:30:00",
            message = "Dear Customer, we are thrilled to introduce our new product line. Check out our website to see what's new and place your order today!"
        ),
        EMail(
            sender = "john.doe@example.com",
            recipient = "samantha.smith@example.com",
            subject = "Lunch on Friday",
            date = "2022-04-26 12:00:00",
            message = "Hi Samantha, do you want to grab lunch on Friday? There's a new restaurant that just opened up that I've been wanting to try."
        ),
        EMail(
            sender = "samantha.smith@example.com",
            recipient = "john.doe@example.com",
            subject = "RE: Lunch on Friday",
            date = "2022-04-26 12:30:00",
            message = "Hi John, that sounds great! What time works for you?"
        ),
        EMail(
            sender = "jane.doe@example.com",
            recipient = "john.doe@example.com",
            subject = "RE: Weekend Plans",
            date = "2022-04-25 14:00:00",
            message = "Hi John, I'm free on Saturday afternoon. How about we go hiking in the nearby park? We can grab dinner afterwards."
        ),
        EMail(
            sender = "john.doe@example.com",
            recipient = "jane.doe@example.com",
            subject = "Weekend Plans",
            date = "2022-04-25 15:00:00",
            message = "Hi Jane, that sounds perfect! Let's plan on meeting at the park at 2 pm on Saturday."
        ),
        EMail(
            sender = "amy.jones@example.com",
            recipient = "john.doe@example.com",
            subject = "Meeting Request",
            date = "2022-04-24 10:00:00",
            message = "Hi John, can we schedule a meeting for next week to discuss the budget for the upcoming project?"
        ),
        EMail(
            sender = "john.doe@example.com",
            recipient = "amy.jones@example.com",
            subject = "RE: Meeting Request",
            date = "2022-04-24 11:00:00",
            message = "Hi Amy, sure, let's schedule a meeting for Tuesday at 2 pm. Does that work for you?"
        ),
        EMail(
            sender = "peter.wilson@example.com",
            recipient = "jane.doe@example.com",
            subject = "Happy Birthday!",
            date = "2022-04-23 09:00:00",
            message = "Dear Jane, I wanted to wish you a very happy birthday! I hope you have a wonderful day filled with joy and celebration."
        ),
        EMail(
            sender = "jane.doe@example.com",
            recipient = "peter.wilson@example.com",
            subject = "RE: Happy Birthday!",
            date = "2022-04-23 10:00:00",
            message = "Hi Peter, thank you so much for the birthday wishes! It means a lot to me."
        ),
        EMail(
            sender = "sales@company.com",
            recipient = "customer3@example.com",
            subject = "Special Offer",
            date = "2022-04-22 15:30:00",
            message = "Dear Customer, for a limited time only, we are offering a 10% discount on all orders over $100. Don't miss out on this great deal!"
        ),
        EMail(
            sender = "john.doe@example.com",
            recipient = "jane.doe@example.com",
            subject = "Reminder",
            date = "2022-04-21 11:00:00",
            message = "Hi Jane, just a friendly reminder that we have a meeting tomorrow at 10 am. See you then!"
        ),
        EMail(
            sender = "jane.doe@example.com",
            recipient = "john.doe@example.com",
            subject = "RE: Reminder",
            date = "2022-04-20 11:30:00",
            message = "Hi John, thanks for the reminder. I'll be there on time!"
        ),
        EMail(
            sender = "info@company.com",
            recipient = "customer1@example.com",
            subject = "New Arrival",
            date = "2022-04-19 09:00:00",
            message = "Dear Customer, we've just received a shipment of new products. Check out our website to see what's new and place your order today!"
        ),
        EMail(
            sender = "amy.jones@example.com",
            recipient = "john.doe@example.com",
            subject = "Project Update",
            date = "2022-04-18 14:00:00",
            message = "Hi John, just wanted to give you a quick update on the project. We're on track to meet the deadline and everything is looking good so far."
        ),
        EMail(
            sender = "john.doe@example.com",
            recipient = "amy.jones@example.com",
            subject = "RE: Project Update",
            date = "2022-04-17 15:00:00",
            message = "Hi Amy, thanks for the update. Let me know if you need any help with anything."
        ),
        EMail(
            sender = "peter.wilson@example.com",
            recipient = "jane.doe@example.com",
            subject = "Upcoming Conference",
            date = "2022-04-16 10:30:00",
            message = "Hi Jane, just wanted to remind you about the upcoming conference next month. Have you had a chance to register yet?"
        ),
        EMail(
            sender = "jane.doe@example.com",
            recipient = "peter.wilson@example.com",
            subject = "RE: Upcoming Conference",
            date = "2022-04-15 11:00:00",
            message = "Hi Peter, thanks for the reminder. I haven't registered yet, but I will do so soon."
        ),
        EMail(
            sender = "sales@company.com",
            recipient = "customer2@example.com",
            subject = "Flash Sale",
            date = "2022-04-14 16:00:00",
            message = "Dear Customer, for the next 24 hours, we are having a flash sale. Get 20% off on all orders with the code FLASH20. Shop now!"
        ),
        EMail(
            sender = "support@company.com",
            recipient = "customer1@example.com",
            subject = "Technical Issue",
            date = "2022-04-13 13:00:00",
            message = "Dear Customer, we are sorry to inform you that we are experiencing technical difficulties with our website. Our team is working on resolving the issue as soon as possible. Thank you for your patience."
        ),
        EMail(
            sender = "customer2@example.com",
            recipient = "support@company.com",
            subject = "RE: Technical Issue",
            date = "2022-04-12 14:00:00",
            message = "Hi Support Team, I'm also experiencing issues with the website. Can you let me know when it's back up and running? Thanks."
        ),
        EMail(
            sender = "manager@example.com",
            recipient = "employee1@example.com",
            subject = "Performance Review",
            date = "2022-04-11 10:30:00",
            message = "Hi Employee, just a heads up that we will be having your performance review next week. Please come prepared with your self-evaluation and any supporting documentation."
        ),
        EMail(
            sender = "employee1@example.com",
            recipient = "manager@example.com",
            subject = "RE: Performance Review",
            date = "2022-04-10 11:00:00",
            message = "Hi Manager, thanks for letting me know. I'll make sure to prepare accordingly."
        ),
        EMail(
            sender = "support@company.com",
            recipient = "customer3@example.com",
            subject = "Product Inquiry",
            date = "2022-04-09 09:00:00",
            message = "Dear Customer, thank you for your recent inquiry about our products. A member of our team will be in touch with you shortly to provide more information."
        ),
        EMail(
            sender = "customer1@example.com",
            recipient = "support@company.com",
            subject = "RE: Technical Issue",
            date = "2022-04-08 10:00:00",
            message = "Hi Support Team, I'm also having trouble with the website. Can you please let me know when it's fixed? Thanks."
        ),
        EMail(
            sender = "jane.doe@example.com",
            recipient = "john.doe@example.com",
            subject = "Recipe Idea",
            date = "2022-04-07 15:00:00",
            message = "Hi John, I came across a new recipe that I think you'll love. It's a healthy twist on a classic comfort food. Let me know if you want me to send it to you!"
        ),
        EMail(
            sender = "john.doe@example.com",
            recipient = "jane.doe@example.com",
            subject = "RE: Recipe Idea",
            date = "2022-04-06 16:00:00",
            message = "Hi Jane, that sounds great! Yes, please send me the recipe. Thanks!"
        )
    )
}