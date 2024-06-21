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
@PrimaryKeyJoinColumn(name = "file_id") /*Usado na joined*/
//@DiscriminatorValue("F")
public class File extends Resource {
    private String type;
}
