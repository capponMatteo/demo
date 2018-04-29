package com.example.demo.issuedashboard.events;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class GithubProject implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String orgName;

    @Column(unique = true)
    private String repoName;

    public GithubProject(String orgName,String repoName){

        this.repoName=repoName;
        this.orgName=orgName;

    }




}
