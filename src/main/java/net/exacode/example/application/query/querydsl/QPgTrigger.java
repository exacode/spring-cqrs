package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTrigger is a Querydsl query type for QPgTrigger
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTrigger extends com.mysema.query.sql.RelationalPathBase<QPgTrigger> {

    private static final long serialVersionUID = 1308539389;

    public static final QPgTrigger pgTrigger = new QPgTrigger("pg_trigger");

    public final SimplePath<byte[]> tgargs = createSimple("tgargs", byte[].class);

    public final SimplePath<Object> tgattr = createSimple("tgattr", Object.class);

    public final NumberPath<Long> tgconstraint = createNumber("tgconstraint", Long.class);

    public final NumberPath<Long> tgconstrindid = createNumber("tgconstrindid", Long.class);

    public final NumberPath<Long> tgconstrrelid = createNumber("tgconstrrelid", Long.class);

    public final BooleanPath tgdeferrable = createBoolean("tgdeferrable");

    public final StringPath tgenabled = createString("tgenabled");

    public final NumberPath<Long> tgfoid = createNumber("tgfoid", Long.class);

    public final BooleanPath tginitdeferred = createBoolean("tginitdeferred");

    public final BooleanPath tgisinternal = createBoolean("tgisinternal");

    public final StringPath tgname = createString("tgname");

    public final NumberPath<Short> tgnargs = createNumber("tgnargs", Short.class);

    public final SimplePath<Object> tgqual = createSimple("tgqual", Object.class);

    public final NumberPath<Long> tgrelid = createNumber("tgrelid", Long.class);

    public final NumberPath<Short> tgtype = createNumber("tgtype", Short.class);

    public QPgTrigger(String variable) {
        super(QPgTrigger.class, forVariable(variable), "pg_catalog", "pg_trigger");
    }

    @SuppressWarnings("all")
    public QPgTrigger(Path<? extends QPgTrigger> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_trigger");
    }

    public QPgTrigger(PathMetadata<?> metadata) {
        super(QPgTrigger.class, metadata, "pg_catalog", "pg_trigger");
    }

}

