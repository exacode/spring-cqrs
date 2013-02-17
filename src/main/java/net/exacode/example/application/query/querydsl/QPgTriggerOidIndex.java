package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTriggerOidIndex is a Querydsl query type for QPgTriggerOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTriggerOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgTriggerOidIndex> {

    private static final long serialVersionUID = -610309563;

    public static final QPgTriggerOidIndex pgTriggerOidIndex = new QPgTriggerOidIndex("pg_trigger_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgTriggerOidIndex(String variable) {
        super(QPgTriggerOidIndex.class, forVariable(variable), "pg_catalog", "pg_trigger_oid_index");
    }

    @SuppressWarnings("all")
    public QPgTriggerOidIndex(Path<? extends QPgTriggerOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_trigger_oid_index");
    }

    public QPgTriggerOidIndex(PathMetadata<?> metadata) {
        super(QPgTriggerOidIndex.class, metadata, "pg_catalog", "pg_trigger_oid_index");
    }

}

