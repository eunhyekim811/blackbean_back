package com.example.blackBean.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Setter
@Getter
@ToString  //인스턴스에 대한 정보를 문자열로 반환
@Table(name="user")
@NoArgsConstructor  //파라키터가 없는 디폴트 생성자 생성
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자 생성
public class User {

    @Id
    @Column(name="user_id")
    private Long id;

    String nickname;
}
