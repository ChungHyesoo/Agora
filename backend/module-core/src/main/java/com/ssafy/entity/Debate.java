package com.ssafy.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Debate extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private User owner;

    @Column
    private String category;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String moderatorOnOff;

    @Column
    private String mode;

    @Column
    private String thumbnailUrl;

    @Column(name = "status")
    private String status;

    @Column
    private LocalDateTime insertedTime;

    @Column
    private LocalDateTime callStartTime;

    @Column
    private LocalDateTime callEndTime;

    @OneToOne(mappedBy = "debate")
    private DebaseResult debaseResult;

}