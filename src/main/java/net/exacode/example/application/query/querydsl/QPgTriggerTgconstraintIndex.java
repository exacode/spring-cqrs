package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTriggerTgconstraintIndex is a Querydsl query type for QPgTriggerTgconstraintIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTriggerTgconstraintIndex extends com.mysema.query.sql.RelationalPathBase<QPgTriggerTgconstraintIndex> {

    private static final long serialVersionUID = -963034715;

    public static final QPgTriggerTgconstraintIndex pgTriggerTgconstraintIndex = new QPgTriggerTgconstraintIndex("pg_trigger_tgconstraint_index");

    public final NumberPath<Long> tgconstraint = createNumber("tgconstraint", Long.class);

    public QPgTriggerTgconstraintIndex(String variable) {
        super(QPgTriggerTgconstraintIndex.class, forVariable(variable), "pg_catalog", "pg_trigger_tgconstraint_index");
    }

    @SuppressWarnings("all")
    public QPgTriggerTgconstraintIndex(Path<? extends QPgTriggerTgconstraintIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_trigger_tgconstraint_index");
    }

    public QPgTriggerTgconstraintIndex(PathMetadata<?> metadata) {
        super(QPgTriggerTgconstraintIndex.class, metadata, "pg_catalog", "pg_trigger_tgconstraint_index");
    }

}

