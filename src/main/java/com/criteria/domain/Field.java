package com.criteria.domain;

import com.criteria.constant.FieldType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Field {

    private String field;
    private String value;
    private FieldType fieldType;
}
