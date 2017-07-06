package mapper;

/**
 * @author : Shubham Aggarwal
 * @since : 06/07/17
 */
import model.Transaction;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Transaction, Transaction> {

    public Transaction process(Transaction item) {
        System.out.println("Processing..." + item);
        return item;
    }
}
