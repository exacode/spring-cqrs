package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAttribute is a Querydsl query type for QPgAttribute
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAttribute extends com.mysema.query.sql.RelationalPathBase<QPgAttribute> {

    private static final long serialVersionUID = -257224287;

    public static final QPgAttribute pgAttribute = new QPgAttribute("pg_attribute");

    public final SimplePath<Object[]> attacl = createSimple("attacl", Object[].class);

    public final StringPath attalign = createString("attalign");

    public final BooleanPath attbyval = createBoolean("attbyval");

    public final NumberPath<Integer> attcacheoff = createNumber("attcacheoff", Integer.class);

    public final NumberPath<Long> attcollation = createNumber("attcollation", Long.class);

    public final BooleanPath atthasdef = createBoolean("atthasdef");

    public final NumberPath<Integer> attinhcount = createNumber("attinhcount", Integer.class);

    public final BooleanPath attisdropped = createBoolean("attisdropped");

    public final BooleanPath attislocal = createBoolean("attislocal");

    public final NumberPath<Short> attlen = createNumber("attlen", Short.class);

    public final StringPath attname = createString("attname");

    public final NumberPath<Integer> attndims = createNumber("attndims", Integer.class);

    public final BooleanPath attnotnull = createBoolean("attnotnull");

    public final NumberPath<Short> attnum = createNumber("attnum", Short.class);

    public final SimplePath<Object[]> attoptions = createSimple("attoptions", Object[].class);

    public final NumberPath<Long> attrelid = createNumber("attrelid", Long.class);

    public final NumberPath<Integer> attstattarget = createNumber("attstattarget", Integer.class);

    public final StringPath attstorage = createString("attstorage");

    public final NumberPath<Long> atttypid = createNumber("atttypid", Long.class);

    public final NumberPath<Integer> atttypmod = createNumber("atttypmod", Integer.class);

    public QPgAttribute(String variable) {
        super(QPgAttribute.class, forVariable(variable), "pg_catalog", "pg_attribute");
    }

    @SuppressWarnings("all")
    public QPgAttribute(Path<? extends QPgAttribute> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_attribute");
    }

    public QPgAttribute(PathMetadata<?> metadata) {
        super(QPgAttribute.class, metadata, "pg_catalog", "pg_attribute");
    }

}

