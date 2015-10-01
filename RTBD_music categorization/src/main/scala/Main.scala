/**
 * Created by Venu on 9/28/15.
 */
object Main {
  def main(args: Array[String]) {
    val sentimentAnalyzer: SentimentAnalyzer = new SentimentAnalyzer
    val tweetWithSentiment: TweetWithSentiment = sentimentAnalyzer.findSentiment("click here for your Sachin Tendulkar personalized digital autograph.")
    System.out.println(tweetWithSentiment)
    val indexofsentiment=tweetWithSentiment.toString().indexOf(":")
    val substringofstatement=tweetWithSentiment.toString().substring(indexofsentiment+1).replace("]", "").trim()
    System.out.println(substringofstatement)
    IosConnector.sendCommandToRobot(substringofstatement)
  }

}
