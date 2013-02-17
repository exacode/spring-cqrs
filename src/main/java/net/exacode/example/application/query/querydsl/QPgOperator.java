package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgOperator is a Querydsl query type for QPgOperator
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgOperator extends com.mysema.query.sql.RelationalPathBase<QPgOperator> {

    private static final long serialVersionUID = -93631233;

    public static final QPgOperator pgOperator = new QPgOperator("pg_operator");

    public final BooleanPath oprcanhash = createBoolean("oprcanhash");

    public final BooleanPath oprcanmerge = createBoolean("oprcanmerge");

    public final SimplePath<Object> oprcode = createSimple("oprcode", Object.class);

    public final NumberPath<Long> oprcom = createNumber("oprcom", Long.class);

    public final SimplePath<Object> oprjoin = createSimple("oprjoin", Object.class);

    public final StringPath oprkind = createString("oprkind");

    public final NumberPath<Long> oprleft = createNumber("oprleft", Long.class);

    public final StringPath oprname = createString("oprname");

    public final NumberPath<Long> oprnamespace = createNumber("oprnamespace", Long.class);

    public final NumberPath<Long> oprnegate = createNumber("oprnegate", Long.class);

    public final NumberPath<Long> oprowner = createNumber("oprowner", Long.class);

    public final SimplePath<Object> oprrest = createSimple("oprrest", Object.class);

    public final NumberPath<Long> oprresult = createNumber("oprresult", Long.class);

    public final NumberPath<Long> oprright = createNumber("oprright", Long.class);

    public QPgOperator(String variable) {
        super(QPgOperator.class, forVariable(variable), "pg_catalog", "pg_operator");
    }

    @SuppressWarnings("all")
    public QPgOperator(Path<? extends QPgOperator> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_operator");
    }

    public QPgOperator(PathMetadata<?> metadata) {
        super(QPgOperator.class, metadata, "pg_catalog", "pg_operator");
    }

}

