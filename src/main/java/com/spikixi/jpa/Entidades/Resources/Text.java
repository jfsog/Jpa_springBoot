package com.spikixi.jpa.Entidades.Resources;

import com.spikixi.jpa.Entidades.Resource;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@PrimaryKeyJoinColumn(name = "text_id") /*Usado na joined*/
//@DiscriminatorValue("T")
public class Text extends Resource {
    private String content;
}
