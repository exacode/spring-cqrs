package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgEnumTypidLabelIndex is a Querydsl query type for QPgEnumTypidLabelIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgEnumTypidLabelIndex extends com.mysema.query.sql.RelationalPathBase<QPgEnumTypidLabelIndex> {

    private static final long serialVersionUID = 466371912;

    public static final QPgEnumTypidLabelIndex pgEnumTypidLabelIndex = new QPgEnumTypidLabelIndex("pg_enum_typid_label_index");

    public final SimplePath<Object> enumlabel = createSimple("enumlabel", Object.class);

    public final NumberPath<Long> enumtypid = createNumber("enumtypid", Long.class);

    public QPgEnumTypidLabelIndex(String variable) {
        super(QPgEnumTypidLabelIndex.class, forVariable(variable), "pg_catalog", "pg_enum_typid_label_index");
    }

    @SuppressWarnings("all")
    public QPgEnumTypidLabelIndex(Path<? extends QPgEnumTypidLabelIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_enum_typid_label_index");
    }

    public QPgEnumTypidLabelIndex(PathMetadata<?> metadata) {
        super(QPgEnumTypidLabelIndex.class, metadata, "pg_catalog", "pg_enum_typid_label_index");
    }

}

