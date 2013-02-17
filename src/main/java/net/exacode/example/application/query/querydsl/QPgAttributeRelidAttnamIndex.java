package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAttributeRelidAttnamIndex is a Querydsl query type for QPgAttributeRelidAttnamIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAttributeRelidAttnamIndex extends com.mysema.query.sql.RelationalPathBase<QPgAttributeRelidAttnamIndex> {

    private static final long serialVersionUID = 718020902;

    public static final QPgAttributeRelidAttnamIndex pgAttributeRelidAttnamIndex = new QPgAttributeRelidAttnamIndex("pg_attribute_relid_attnam_index");

    public final SimplePath<Object> attname = createSimple("attname", Object.class);

    public final NumberPath<Long> attrelid = createNumber("attrelid", Long.class);

    public QPgAttributeRelidAttnamIndex(String variable) {
        super(QPgAttributeRelidAttnamIndex.class, forVariable(variable), "pg_catalog", "pg_attribute_relid_attnam_index");
    }

    @SuppressWarnings("all")
    public QPgAttributeRelidAttnamIndex(Path<? extends QPgAttributeRelidAttnamIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_attribute_relid_attnam_index");
    }

    public QPgAttributeRelidAttnamIndex(PathMetadata<?> metadata) {
        super(QPgAttributeRelidAttnamIndex.class, metadata, "pg_catalog", "pg_attribute_relid_attnam_index");
    }

}

