package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAttributeRelidAttnumIndex is a Querydsl query type for QPgAttributeRelidAttnumIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAttributeRelidAttnumIndex extends com.mysema.query.sql.RelationalPathBase<QPgAttributeRelidAttnumIndex> {

    private static final long serialVersionUID = 1288225338;

    public static final QPgAttributeRelidAttnumIndex pgAttributeRelidAttnumIndex = new QPgAttributeRelidAttnumIndex("pg_attribute_relid_attnum_index");

    public final NumberPath<Short> attnum = createNumber("attnum", Short.class);

    public final NumberPath<Long> attrelid = createNumber("attrelid", Long.class);

    public QPgAttributeRelidAttnumIndex(String variable) {
        super(QPgAttributeRelidAttnumIndex.class, forVariable(variable), "pg_catalog", "pg_attribute_relid_attnum_index");
    }

    @SuppressWarnings("all")
    public QPgAttributeRelidAttnumIndex(Path<? extends QPgAttributeRelidAttnumIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_attribute_relid_attnum_index");
    }

    public QPgAttributeRelidAttnumIndex(PathMetadata<?> metadata) {
        super(QPgAttributeRelidAttnumIndex.class, metadata, "pg_catalog", "pg_attribute_relid_attnum_index");
    }

}

