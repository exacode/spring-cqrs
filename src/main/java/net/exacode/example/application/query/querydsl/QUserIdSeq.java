package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserIdSeq is a Querydsl query type for QUserIdSeq
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUserIdSeq extends com.mysema.query.sql.RelationalPathBase<QUserIdSeq> {

    private static final long serialVersionUID = -1821878667;

    public static final QUserIdSeq userIdSeq = new QUserIdSeq("user_id_seq");

    public final NumberPath<Long> cacheValue = createNumber("cache_value", Long.class);

    public final NumberPath<Long> incrementBy = createNumber("increment_by", Long.class);

    public final BooleanPath isCalled = createBoolean("is_called");

    public final BooleanPath isCycled = createBoolean("is_cycled");

    public final NumberPath<Long> lastValue = createNumber("last_value", Long.class);

    public final NumberPath<Long> logCnt = createNumber("log_cnt", Long.class);

    public final NumberPath<Long> maxValue = createNumber("max_value", Long.class);

    public final NumberPath<Long> minValue = createNumber("min_value", Long.class);

    public final StringPath sequenceName = createString("sequence_name");

    public final NumberPath<Long> startValue = createNumber("start_value", Long.class);

    public QUserIdSeq(String variable) {
        super(QUserIdSeq.class, forVariable(variable), "public", "user_id_seq");
    }

    @SuppressWarnings("all")
    public QUserIdSeq(Path<? extends QUserIdSeq> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "user_id_seq");
    }

    public QUserIdSeq(PathMetadata<?> metadata) {
        super(QUserIdSeq.class, metadata, "public", "user_id_seq");
    }

}

