package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgProc is a Querydsl query type for QPgProc
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgProc extends com.mysema.query.sql.RelationalPathBase<QPgProc> {

    private static final long serialVersionUID = 693382449;

    public static final QPgProc pgProc = new QPgProc("pg_proc");

    public final SimplePath<Object[]> proacl = createSimple("proacl", Object[].class);

    public final SimplePath<Object[]> proallargtypes = createSimple("proallargtypes", Object[].class);

    public final SimplePath<Object> proargdefaults = createSimple("proargdefaults", Object.class);

    public final SimplePath<Object[]> proargmodes = createSimple("proargmodes", Object[].class);

    public final SimplePath<Object[]> proargnames = createSimple("proargnames", Object[].class);

    public final SimplePath<Object> proargtypes = createSimple("proargtypes", Object.class);

    public final StringPath probin = createString("probin");

    public final SimplePath<Object[]> proconfig = createSimple("proconfig", Object[].class);

    public final NumberPath<Float> procost = createNumber("procost", Float.class);

    public final BooleanPath proisagg = createBoolean("proisagg");

    public final BooleanPath proisstrict = createBoolean("proisstrict");

    public final BooleanPath proiswindow = createBoolean("proiswindow");

    public final NumberPath<Long> prolang = createNumber("prolang", Long.class);

    public final StringPath proname = createString("proname");

    public final NumberPath<Long> pronamespace = createNumber("pronamespace", Long.class);

    public final NumberPath<Short> pronargdefaults = createNumber("pronargdefaults", Short.class);

    public final NumberPath<Short> pronargs = createNumber("pronargs", Short.class);

    public final NumberPath<Long> proowner = createNumber("proowner", Long.class);

    public final BooleanPath proretset = createBoolean("proretset");

    public final NumberPath<Long> prorettype = createNumber("prorettype", Long.class);

    public final NumberPath<Float> prorows = createNumber("prorows", Float.class);

    public final BooleanPath prosecdef = createBoolean("prosecdef");

    public final StringPath prosrc = createString("prosrc");

    public final NumberPath<Long> provariadic = createNumber("provariadic", Long.class);

    public final StringPath provolatile = createString("provolatile");

    public QPgProc(String variable) {
        super(QPgProc.class, forVariable(variable), "pg_catalog", "pg_proc");
    }

    @SuppressWarnings("all")
    public QPgProc(Path<? extends QPgProc> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_proc");
    }

    public QPgProc(PathMetadata<?> metadata) {
        super(QPgProc.class, metadata, "pg_catalog", "pg_proc");
    }

}

