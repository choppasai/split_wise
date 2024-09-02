package SplitWise.ExpenseTracker.Models;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @CreatedDate
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @LastModifiedDate
    @Temporal(TemporalType.DATE)
    private Date lastModifiedAt;
}
