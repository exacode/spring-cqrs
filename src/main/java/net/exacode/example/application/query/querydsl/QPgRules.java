package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgRules is a Querydsl query type for QPgRules
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgRules extends com.mysema.query.sql.RelationalPathBase<QPgRules> {

    private static final long serialVersionUID = 21953148;

    public static final QPgRules pgRules = new QPgRules("pg_rules");

    public final StringPath definition = createString("definition");

    public final StringPath rulename = createString("rulename");

    public final StringPath schemaname = createString("schemaname");

    public final StringPath tablename = createString("tablename");

    public QPgRules(String variable) {
        super(QPgRules.class, forVariable(variable), "pg_catalog", "pg_rules");
    }

    @SuppressWarnings("all")
    public QPgRules(Path<? extends QPgRules> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_rules");
    }

    public QPgRules(PathMetadata<?> metadata) {
        super(QPgRules.class, metadata, "pg_catalog", "pg_rules");
    }

}

