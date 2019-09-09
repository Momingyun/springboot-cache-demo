package com.cache.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author ramostear
 * @create-time 2019/4/7 0007-0:45
 * @modify by :
 * @since:
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable{

    private Long id;

    private String userName;

    private String email;
}