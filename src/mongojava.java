import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class mongojava {

	public static void main(String[] args) {
		System.out.println("Start db");
		connect();
	}
	
	public static void connect() {
	
		 MongoClientURI connectionString = new MongoClientURI("mongodb://user:pass@www.epocum.com:27017");
		 MongoClient mongo = new MongoClient(connectionString);
		 MongoDatabase database = mongo.getDatabase("admin");
		 MongoCollection<Document> collection = database.getCollection("persone");
		 Document obj = collection.find().first();
		 System.out.println(obj.toJson());
		 mongo.close();
	}

}
