package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDescription is a Querydsl query type for QPgDescription
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDescription extends com.mysema.query.sql.RelationalPathBase<QPgDescription> {

    private static final long serialVersionUID = 500907457;

    public static final QPgDescription pgDescription = new QPgDescription("pg_description");

    public final NumberPath<Long> classoid = createNumber("classoid", Long.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> objoid = createNumber("objoid", Long.class);

    public final NumberPath<Integer> objsubid = createNumber("objsubid", Integer.class);

    public QPgDescription(String variable) {
        super(QPgDescription.class, forVariable(variable), "pg_catalog", "pg_description");
    }

    @SuppressWarnings("all")
    public QPgDescription(Path<? extends QPgDescription> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_description");
    }

    public QPgDescription(PathMetadata<?> metadata) {
        super(QPgDescription.class, metadata, "pg_catalog", "pg_description");
    }

}

