package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgRewrite is a Querydsl query type for QPgRewrite
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgRewrite extends com.mysema.query.sql.RelationalPathBase<QPgRewrite> {

    private static final long serialVersionUID = -825387567;

    public static final QPgRewrite pgRewrite = new QPgRewrite("pg_rewrite");

    public final SimplePath<Object> evAction = createSimple("ev_action", Object.class);

    public final NumberPath<Short> evAttr = createNumber("ev_attr", Short.class);

    public final NumberPath<Long> evClass = createNumber("ev_class", Long.class);

    public final StringPath evEnabled = createString("ev_enabled");

    public final SimplePath<Object> evQual = createSimple("ev_qual", Object.class);

    public final StringPath evType = createString("ev_type");

    public final BooleanPath isInstead = createBoolean("is_instead");

    public final StringPath rulename = createString("rulename");

    public QPgRewrite(String variable) {
        super(QPgRewrite.class, forVariable(variable), "pg_catalog", "pg_rewrite");
    }

    @SuppressWarnings("all")
    public QPgRewrite(Path<? extends QPgRewrite> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_rewrite");
    }

    public QPgRewrite(PathMetadata<?> metadata) {
        super(QPgRewrite.class, metadata, "pg_catalog", "pg_rewrite");
    }

}

