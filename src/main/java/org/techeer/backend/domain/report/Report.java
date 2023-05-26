package org.techeer.backend.domain.report;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "report")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seatId", nullable = false)
    private Integer seatId;

    @Column(name = "num", nullable = false)
    private Integer num;

    @Column(name = "report_content", nullable = false, length = 500)
    private String reportContent;

    @Column(name = "report_time")
    private LocalDateTime reportTime;
}