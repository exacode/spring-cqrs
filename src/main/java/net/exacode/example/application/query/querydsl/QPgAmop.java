package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAmop is a Querydsl query type for QPgAmop
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAmop extends com.mysema.query.sql.RelationalPathBase<QPgAmop> {

    private static final long serialVersionUID = 692930792;

    public static final QPgAmop pgAmop = new QPgAmop("pg_amop");

    public final NumberPath<Long> amopfamily = createNumber("amopfamily", Long.class);

    public final NumberPath<Long> amoplefttype = createNumber("amoplefttype", Long.class);

    public final NumberPath<Long> amopmethod = createNumber("amopmethod", Long.class);

    public final NumberPath<Long> amopopr = createNumber("amopopr", Long.class);

    public final StringPath amoppurpose = createString("amoppurpose");

    public final NumberPath<Long> amoprighttype = createNumber("amoprighttype", Long.class);

    public final NumberPath<Long> amopsortfamily = createNumber("amopsortfamily", Long.class);

    public final NumberPath<Short> amopstrategy = createNumber("amopstrategy", Short.class);

    public QPgAmop(String variable) {
        super(QPgAmop.class, forVariable(variable), "pg_catalog", "pg_amop");
    }

    @SuppressWarnings("all")
    public QPgAmop(Path<? extends QPgAmop> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_amop");
    }

    public QPgAmop(PathMetadata<?> metadata) {
        super(QPgAmop.class, metadata, "pg_catalog", "pg_amop");
    }

}

