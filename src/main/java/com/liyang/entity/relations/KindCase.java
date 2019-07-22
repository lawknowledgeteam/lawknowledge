package com.liyang.entity.relations;

import com.liyang.entity.node.CaseKind;
import com.liyang.entity.node.LawCase;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

/**
 * @Author: Pan
 * @Date: 2019/7/22 9:05
 * @Description:
 **/
@Getter
@Setter
@NoArgsConstructor
@RelationshipEntity(type = "KindCase")
public class KindCase {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private CaseKind caseKind;

    @EndNode
    private LawCase lawCase;

    @Property(name = "type")
    private String type;
}
