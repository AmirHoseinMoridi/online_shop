package Entity;

import Base.Entity.BaseUser;
import Entity.Enumeration.ProducerRank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producer extends BaseUser {
    public static final String PRODUCER_RANK = "producer_rank";
    ProducerRank producerRank;
}
