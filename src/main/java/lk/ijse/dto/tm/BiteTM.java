package lk.ijse.dto.tm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BiteTM {
    private String item_id;
    private double unit_price;
    private String description;
}
