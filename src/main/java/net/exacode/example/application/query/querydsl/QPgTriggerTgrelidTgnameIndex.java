package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTriggerTgrelidTgnameIndex is a Querydsl query type for QPgTriggerTgrelidTgnameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTriggerTgrelidTgnameIndex extends com.mysema.query.sql.RelationalPathBase<QPgTriggerTgrelidTgnameIndex> {

    private static final long serialVersionUID = -757174992;

    public static final QPgTriggerTgrelidTgnameIndex pgTriggerTgrelidTgnameIndex = new QPgTriggerTgrelidTgnameIndex("pg_trigger_tgrelid_tgname_index");

    public final SimplePath<Object> tgname = createSimple("tgname", Object.class);

    public final NumberPath<Long> tgrelid = createNumber("tgrelid", Long.class);

    public QPgTriggerTgrelidTgnameIndex(String variable) {
        super(QPgTriggerTgrelidTgnameIndex.class, forVariable(variable), "pg_catalog", "pg_trigger_tgrelid_tgname_index");
    }

    @SuppressWarnings("all")
    public QPgTriggerTgrelidTgnameIndex(Path<? extends QPgTriggerTgrelidTgnameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_trigger_tgrelid_tgname_index");
    }

    public QPgTriggerTgrelidTgnameIndex(PathMetadata<?> metadata) {
        super(QPgTriggerTgrelidTgnameIndex.class, metadata, "pg_catalog", "pg_trigger_tgrelid_tgname_index");
    }

}

