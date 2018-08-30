import java.util.Date;
import java.util.UUID;
import com.modal.Node;
import com.util.Encription;

public class GenesisMain {

  public static void main(String[] args) {
    //take Input data 
    String input="";
    int noOfChild =5;// input
    Node parentNode = new Node();
    parentNode.setTimestamp(new Date());
    parentNode.setData(Encription.applySha256(input));
    parentNode.setNodeId(UUID.randomUUID().toString());
    parentNode.setNodeNumber(0);
    parentNode.setReferenceNodeId(null);
    parentNode.setGenesisReferenceNodeId(parentNode.toString());
    parentNode.setChildReferenceNodeId(new String[noOfChild]);
    parentNode.setHashValue(parentNode.calculateHash());
    
    
  }
  
}
