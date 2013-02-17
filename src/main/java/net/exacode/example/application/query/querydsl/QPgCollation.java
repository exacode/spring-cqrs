package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgCollation is a Querydsl query type for QPgCollation
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgCollation extends com.mysema.query.sql.RelationalPathBase<QPgCollation> {

    private static final long serialVersionUID = 1609983630;

    public static final QPgCollation pgCollation = new QPgCollation("pg_collation");

    public final StringPath collcollate = createString("collcollate");

    public final StringPath collctype = createString("collctype");

    public final NumberPath<Integer> collencoding = createNumber("collencoding", Integer.class);

    public final StringPath collname = createString("collname");

    public final NumberPath<Long> collnamespace = createNumber("collnamespace", Long.class);

    public final NumberPath<Long> collowner = createNumber("collowner", Long.class);

    public QPgCollation(String variable) {
        super(QPgCollation.class, forVariable(variable), "pg_catalog", "pg_collation");
    }

    @SuppressWarnings("all")
    public QPgCollation(Path<? extends QPgCollation> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_collation");
    }

    public QPgCollation(PathMetadata<?> metadata) {
        super(QPgCollation.class, metadata, "pg_catalog", "pg_collation");
    }

}

