package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAttrdefOidIndex is a Querydsl query type for QPgAttrdefOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAttrdefOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgAttrdefOidIndex> {

    private static final long serialVersionUID = -697159423;

    public static final QPgAttrdefOidIndex pgAttrdefOidIndex = new QPgAttrdefOidIndex("pg_attrdef_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgAttrdefOidIndex(String variable) {
        super(QPgAttrdefOidIndex.class, forVariable(variable), "pg_catalog", "pg_attrdef_oid_index");
    }

    @SuppressWarnings("all")
    public QPgAttrdefOidIndex(Path<? extends QPgAttrdefOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_attrdef_oid_index");
    }

    public QPgAttrdefOidIndex(PathMetadata<?> metadata) {
        super(QPgAttrdefOidIndex.class, metadata, "pg_catalog", "pg_attrdef_oid_index");
    }

}

