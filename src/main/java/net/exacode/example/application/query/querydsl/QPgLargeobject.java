package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgLargeobject is a Querydsl query type for QPgLargeobject
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgLargeobject extends com.mysema.query.sql.RelationalPathBase<QPgLargeobject> {

    private static final long serialVersionUID = 1490911231;

    public static final QPgLargeobject pgLargeobject = new QPgLargeobject("pg_largeobject");

    public final SimplePath<byte[]> data = createSimple("data", byte[].class);

    public final NumberPath<Long> loid = createNumber("loid", Long.class);

    public final NumberPath<Integer> pageno = createNumber("pageno", Integer.class);

    public QPgLargeobject(String variable) {
        super(QPgLargeobject.class, forVariable(variable), "pg_catalog", "pg_largeobject");
    }

    @SuppressWarnings("all")
    public QPgLargeobject(Path<? extends QPgLargeobject> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_largeobject");
    }

    public QPgLargeobject(PathMetadata<?> metadata) {
        super(QPgLargeobject.class, metadata, "pg_catalog", "pg_largeobject");
    }

}

