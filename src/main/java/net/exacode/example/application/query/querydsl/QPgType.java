package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgType is a Querydsl query type for QPgType
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgType extends com.mysema.query.sql.RelationalPathBase<QPgType> {

    private static final long serialVersionUID = 693508373;

    public static final QPgType pgType = new QPgType("pg_type");

    public final StringPath typalign = createString("typalign");

    public final SimplePath<Object> typanalyze = createSimple("typanalyze", Object.class);

    public final NumberPath<Long> typarray = createNumber("typarray", Long.class);

    public final NumberPath<Long> typbasetype = createNumber("typbasetype", Long.class);

    public final BooleanPath typbyval = createBoolean("typbyval");

    public final StringPath typcategory = createString("typcategory");

    public final NumberPath<Long> typcollation = createNumber("typcollation", Long.class);

    public final StringPath typdefault = createString("typdefault");

    public final SimplePath<Object> typdefaultbin = createSimple("typdefaultbin", Object.class);

    public final StringPath typdelim = createString("typdelim");

    public final NumberPath<Long> typelem = createNumber("typelem", Long.class);

    public final SimplePath<Object> typinput = createSimple("typinput", Object.class);

    public final BooleanPath typisdefined = createBoolean("typisdefined");

    public final BooleanPath typispreferred = createBoolean("typispreferred");

    public final NumberPath<Short> typlen = createNumber("typlen", Short.class);

    public final SimplePath<Object> typmodin = createSimple("typmodin", Object.class);

    public final SimplePath<Object> typmodout = createSimple("typmodout", Object.class);

    public final StringPath typname = createString("typname");

    public final NumberPath<Long> typnamespace = createNumber("typnamespace", Long.class);

    public final NumberPath<Integer> typndims = createNumber("typndims", Integer.class);

    public final BooleanPath typnotnull = createBoolean("typnotnull");

    public final SimplePath<Object> typoutput = createSimple("typoutput", Object.class);

    public final NumberPath<Long> typowner = createNumber("typowner", Long.class);

    public final SimplePath<Object> typreceive = createSimple("typreceive", Object.class);

    public final NumberPath<Long> typrelid = createNumber("typrelid", Long.class);

    public final SimplePath<Object> typsend = createSimple("typsend", Object.class);

    public final StringPath typstorage = createString("typstorage");

    public final StringPath typtype = createString("typtype");

    public final NumberPath<Integer> typtypmod = createNumber("typtypmod", Integer.class);

    public QPgType(String variable) {
        super(QPgType.class, forVariable(variable), "pg_catalog", "pg_type");
    }

    @SuppressWarnings("all")
    public QPgType(Path<? extends QPgType> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_type");
    }

    public QPgType(PathMetadata<?> metadata) {
        super(QPgType.class, metadata, "pg_catalog", "pg_type");
    }

}

