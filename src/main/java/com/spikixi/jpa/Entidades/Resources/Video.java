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
@PrimaryKeyJoinColumn(name = "video_id") /*Usado na joined*/
//@DiscriminatorValue("V") /*usado na SINBLE_TABLE*/
public class Video extends Resource {
    private int length;
}
