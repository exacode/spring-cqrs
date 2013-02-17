package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgEnum is a Querydsl query type for QPgEnum
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgEnum extends com.mysema.query.sql.RelationalPathBase<QPgEnum> {

    private static final long serialVersionUID = 693051100;

    public static final QPgEnum pgEnum = new QPgEnum("pg_enum");

    public final StringPath enumlabel = createString("enumlabel");

    public final NumberPath<Float> enumsortorder = createNumber("enumsortorder", Float.class);

    public final NumberPath<Long> enumtypid = createNumber("enumtypid", Long.class);

    public QPgEnum(String variable) {
        super(QPgEnum.class, forVariable(variable), "pg_catalog", "pg_enum");
    }

    @SuppressWarnings("all")
    public QPgEnum(Path<? extends QPgEnum> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_enum");
    }

    public QPgEnum(PathMetadata<?> metadata) {
        super(QPgEnum.class, metadata, "pg_catalog", "pg_enum");
    }

}

