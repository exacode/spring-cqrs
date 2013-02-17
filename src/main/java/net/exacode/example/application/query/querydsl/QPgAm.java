package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAm is a Querydsl query type for QPgAm
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAm extends com.mysema.query.sql.RelationalPathBase<QPgAm> {

    private static final long serialVersionUID = -1751232313;

    public static final QPgAm pgAm = new QPgAm("pg_am");

    public final SimplePath<Object> ambeginscan = createSimple("ambeginscan", Object.class);

    public final SimplePath<Object> ambuild = createSimple("ambuild", Object.class);

    public final SimplePath<Object> ambuildempty = createSimple("ambuildempty", Object.class);

    public final SimplePath<Object> ambulkdelete = createSimple("ambulkdelete", Object.class);

    public final BooleanPath amcanbackward = createBoolean("amcanbackward");

    public final BooleanPath amcanmulticol = createBoolean("amcanmulticol");

    public final BooleanPath amcanorder = createBoolean("amcanorder");

    public final BooleanPath amcanorderbyop = createBoolean("amcanorderbyop");

    public final BooleanPath amcanunique = createBoolean("amcanunique");

    public final BooleanPath amclusterable = createBoolean("amclusterable");

    public final SimplePath<Object> amcostestimate = createSimple("amcostestimate", Object.class);

    public final SimplePath<Object> amendscan = createSimple("amendscan", Object.class);

    public final SimplePath<Object> amgetbitmap = createSimple("amgetbitmap", Object.class);

    public final SimplePath<Object> amgettuple = createSimple("amgettuple", Object.class);

    public final SimplePath<Object> aminsert = createSimple("aminsert", Object.class);

    public final NumberPath<Long> amkeytype = createNumber("amkeytype", Long.class);

    public final SimplePath<Object> ammarkpos = createSimple("ammarkpos", Object.class);

    public final StringPath amname = createString("amname");

    public final BooleanPath amoptionalkey = createBoolean("amoptionalkey");

    public final SimplePath<Object> amoptions = createSimple("amoptions", Object.class);

    public final BooleanPath ampredlocks = createBoolean("ampredlocks");

    public final SimplePath<Object> amrescan = createSimple("amrescan", Object.class);

    public final SimplePath<Object> amrestrpos = createSimple("amrestrpos", Object.class);

    public final BooleanPath amsearchnulls = createBoolean("amsearchnulls");

    public final BooleanPath amstorage = createBoolean("amstorage");

    public final NumberPath<Short> amstrategies = createNumber("amstrategies", Short.class);

    public final NumberPath<Short> amsupport = createNumber("amsupport", Short.class);

    public final SimplePath<Object> amvacuumcleanup = createSimple("amvacuumcleanup", Object.class);

    public QPgAm(String variable) {
        super(QPgAm.class, forVariable(variable), "pg_catalog", "pg_am");
    }

    @SuppressWarnings("all")
    public QPgAm(Path<? extends QPgAm> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_am");
    }

    public QPgAm(PathMetadata<?> metadata) {
        super(QPgAm.class, metadata, "pg_catalog", "pg_am");
    }

}

